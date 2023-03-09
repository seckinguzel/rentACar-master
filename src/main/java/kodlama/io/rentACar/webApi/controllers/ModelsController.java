package kodlama.io.rentACar.webApi.controllers;

import kodlama.io.rentACar.business.abstracts.ModelService;
import kodlama.io.rentACar.business.responses.GetAllModelsResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/models")
@AllArgsConstructor
public class ModelsController {
    private ModelService modelService;

    @GetMapping("/getall")
    public List<GetAllModelsResponse> getAll(){
        return modelService.getAll();
    }
}
