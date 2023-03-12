package kodlama.io.rentACar.core.utilities.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ValidationProblemDetails extends ProblemDetails { //I got the message from ProblemDetails and I set infos with using HashMap.
    private Map<String, String> validationErrors; //With this action I can see the details of the exception.
}
