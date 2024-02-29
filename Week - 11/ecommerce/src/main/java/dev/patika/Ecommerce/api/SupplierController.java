package dev.patika.Ecommerce.api;

import dev.patika.Ecommerce.business.abstracts.ISupplierService;
import dev.patika.Ecommerce.core.config.modelMapper.IModelMapperService;
import dev.patika.Ecommerce.core.result.Result;
import dev.patika.Ecommerce.core.result.ResultData;
import dev.patika.Ecommerce.core.utilities.ResultHelper;
import dev.patika.Ecommerce.dto.request.category.CategorySaveRequest;
import dev.patika.Ecommerce.dto.request.supplier.SupplierSaveRequest;
import dev.patika.Ecommerce.dto.request.supplier.SupplierUpdateRequest;
import dev.patika.Ecommerce.dto.response.CursorResponse;
import dev.patika.Ecommerce.dto.response.category.CategoryResponse;
import dev.patika.Ecommerce.dto.response.supplier.SupplierResponse;
import dev.patika.Ecommerce.entities.Category;
import dev.patika.Ecommerce.entities.Supplier;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/suppliers")
public class SupplierController {
    private final ISupplierService supplierService;
    private final IModelMapperService modelMapper;

    public SupplierController(ISupplierService supplierService, IModelMapperService modelMapper) {
        this.supplierService = supplierService;
        this.modelMapper = modelMapper;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public ResultData<SupplierResponse> save(@Valid @RequestBody SupplierSaveRequest supplierSaveRequest){
        // Request için
        Supplier saveSupplier = this.modelMapper.forRequest().map(supplierSaveRequest,Supplier.class);
        this.supplierService.save(saveSupplier);

        // Response
        return ResultHelper.created(this.modelMapper.forResponse().map(saveSupplier,SupplierResponse.class));
    }

    @PutMapping()
    @ResponseStatus(HttpStatus.OK)
    public ResultData<SupplierResponse> update(@Valid @RequestBody SupplierUpdateRequest supplierUpdateRequest){
        // Request için
        Supplier updateSupplier = this.modelMapper.forRequest().map(supplierUpdateRequest,Supplier.class);
        this.supplierService.save(updateSupplier);

        // Response
        return ResultHelper.success(this.modelMapper.forResponse().map(updateSupplier,SupplierResponse.class));
    }
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResultData<SupplierResponse> get(@PathVariable("id") int id){
        Supplier supplier = this.supplierService.get(id);
        return ResultHelper.success(this.modelMapper.forResponse().map(supplier, SupplierResponse.class));
    }
    // Bütün sayfalama işlemleri için kullanılabilir.
    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public ResultData<CursorResponse<SupplierResponse>> cursor(
            @RequestParam(name = "page", required = false,defaultValue = "0") int page,
            @RequestParam(name = "pageSize" , required = false, defaultValue = "10") int pageSize
    ){
        Page<Supplier> supplierPage = this.supplierService.cursor(page,pageSize);
        Page<SupplierResponse> supplierResponsePage = supplierPage
                .map(supplier -> this.modelMapper.forResponse().map(supplier,SupplierResponse.class));


        return ResultHelper.cursor(supplierResponsePage);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Result delete(@PathVariable("id")int id){
        this.supplierService.delete(id);
        return ResultHelper.ok();
    }
}
