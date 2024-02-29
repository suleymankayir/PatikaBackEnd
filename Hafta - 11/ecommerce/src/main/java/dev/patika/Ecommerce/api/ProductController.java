package dev.patika.Ecommerce.api;

import dev.patika.Ecommerce.business.abstracts.ICategoryService;
import dev.patika.Ecommerce.business.abstracts.IProductService;
import dev.patika.Ecommerce.business.abstracts.ISupplierService;
import dev.patika.Ecommerce.core.config.modelMapper.IModelMapperService;
import dev.patika.Ecommerce.core.result.ResultData;
import dev.patika.Ecommerce.core.utilities.ResultHelper;
import dev.patika.Ecommerce.dto.request.product.ProductSaveRequest;
import dev.patika.Ecommerce.dto.response.product.ProductResponse;
import dev.patika.Ecommerce.dto.response.supplier.SupplierResponse;
import dev.patika.Ecommerce.entities.Category;
import dev.patika.Ecommerce.entities.Product;
import dev.patika.Ecommerce.entities.Supplier;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/products")
public class ProductController {
    private final IProductService productService;
    private final IModelMapperService modelMapper;
    private final ICategoryService categoryService;
    private final ISupplierService supplierService;

    public ProductController(IProductService productService, IModelMapperService modelMapper, ICategoryService categoryService, ISupplierService supplierService) {
        this.productService = productService;
        this.modelMapper = modelMapper;
        this.categoryService = categoryService;
        this.supplierService = supplierService;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public ResultData<ProductResponse> save(@Valid @RequestBody ProductSaveRequest productSaveRequest) {
        // Request için
        Product saveProduct = this.modelMapper.forRequest().map(productSaveRequest, Product.class);
        // Product içindeki category için categoryService çağırdık
        Category category = this.categoryService.get(productSaveRequest.getCategoryId());
        saveProduct.setCategory(category);
        // Product içindeki supplier için productService çağırdık
        Supplier supplier = this.supplierService.get(productSaveRequest.getSupplierId());
        saveProduct.setSupplier(supplier);


        this.productService.save(saveProduct);
        // Response
        return ResultHelper.created(this.modelMapper.forResponse().map(saveProduct, ProductResponse.class));
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResultData<ProductResponse> get(@PathVariable("id") int id) {
        Product product = this.productService.get(id);
        return ResultHelper.success(this.modelMapper.forResponse().map(product, ProductResponse.class));
    }

    @GetMapping("/{id}/supplier")
    @ResponseStatus(HttpStatus.OK)
    public ResultData<SupplierResponse> getSupplier(@PathVariable("id") int id) {
        Product product = this.productService.get(id);
        return ResultHelper.success(this.modelMapper.forResponse().map(product.getSupplier(), SupplierResponse.class));
    }
}
