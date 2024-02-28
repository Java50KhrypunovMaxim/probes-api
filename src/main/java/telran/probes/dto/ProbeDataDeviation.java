package telran.probes.dto;

import java.util.Objects;

public record ProbeDataDeviation(long sensorId, double value, double deviation, long timestamp) {

	@Override
	public int hashCode() {
		return Objects.hash(deviation, sensorId, value);
	}

}