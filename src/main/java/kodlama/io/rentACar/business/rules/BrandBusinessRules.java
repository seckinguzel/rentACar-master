package kodlama.io.rentACar.business.rules;

import kodlama.io.rentACar.core.utilities.exceptions.BusinessException;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BrandBusinessRules {
    private BrandRepository brandRepository;

    public void checkIfBrandNameExists(String name) {
        if (this.brandRepository.existsByName(name)) {
            throw new BusinessException("Brand name is already exists!"); //First I have used -> throw new RuntimeException("Brand already exists!"); in here then I have converted the structure with different method but if I was used this type next actions could be like next moves. If I was used throw new Exception(""); then above method should be informed with this -> public void checkIfBrandNameExists(String name).
        }
    }
}
