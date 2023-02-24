package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import kodlama.io.rentACar.business.requests.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetByIdBrandResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;

@RestController
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandsController {
	private BrandService brandService;
	
	@GetMapping("/getall")
	public List<GetAllBrandsResponse> getAll(){
		return brandService.getAll();
	}

	@GetMapping("/getbyid/{id}")
	public GetByIdBrandResponse getById(@PathVariable int id){
		return brandService.getById(id);
	}
	
	@PostMapping("/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(@RequestBody() CreateBrandRequest createBrandRequest) {
		this.brandService.add(createBrandRequest);
	}

	@PutMapping("/update")
	public void update(@RequestBody() UpdateBrandRequest updateBrandRequest){
		this.brandService.update(updateBrandRequest);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id){
		this.brandService.delete(id);
	}
}
