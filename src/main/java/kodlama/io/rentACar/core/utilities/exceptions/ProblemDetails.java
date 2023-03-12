package kodlama.io.rentACar.core.utilities.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//This class has been creted for to show exception details which about to show my own infos because I don't want to show my all infos to the first user.

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProblemDetails {
    String message;
    //I can add more fields to return to the first user.
}
