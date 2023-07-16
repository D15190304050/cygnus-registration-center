package stark.coderaider.cygnus.registration.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class JobRegistrationInfo
{
    @NotBlank(message = "App name cannot be null or empty.")
    private String appName;

    @NotBlank(message = "Group name cannot be null or empty.")
    private String groupName;

    @NotBlank(message = "Job name cannot be null or empty.")
    private String jobName;

    @NotBlank(message = "IPv4 Address cannot be null or empty.")
    @Pattern(regexp = "((2(5[0-5]|[0-4]\\d))|[0-1]?\\d{1,2})(\\.((2(5[0-5]|[0-4]\\d))|[0-1]?\\d{1,2})){3}", message = "Please provide a correct IPv4 address.")
    private String ipv4Address;

    @Range(min = 1, max = 65535, message = "Port must between 1 & 65535.")
    private int port;

    @Min(value = 1, message = "Weight must be >= 1.")
    private int weight;
    private boolean enabled;

    // Given the regular expression of cron expression is complicated, it is validated in the validation method.
    private String cronExpression;
}
