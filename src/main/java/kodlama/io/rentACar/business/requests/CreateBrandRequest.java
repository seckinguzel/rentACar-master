package kodlama.io.rentACar.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBrandRequest {
    //id is automatically increases so we dont need id here.

    @NotNull
    @NotBlank
    @Size(min = 3, max = 20)
    private String name;
}
