package kodlama.io.rentACar.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateBrandRequest {
    private int id; //neyi güncelleyeceğimi görmek istediğim için update yaparken id field'ını ekledik.
    private String name;
}
