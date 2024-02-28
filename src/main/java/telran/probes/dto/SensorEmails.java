package telran.probes.dto;

import jakarta.validation.constraints.NotNull;
import static telran.probes.messages.ErrorMassages.MISING_EMAILS;

public record SensorEmails(@NotNull(message = MISING_EMAILS) long id,
		String[] mails) {

}
