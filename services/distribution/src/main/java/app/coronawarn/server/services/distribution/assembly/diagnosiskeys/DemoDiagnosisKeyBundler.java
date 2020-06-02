package app.coronawarn.server.services.distribution.assembly.diagnosiskeys;

import static java.util.stream.Collectors.groupingBy;

import app.coronawarn.server.common.persistence.domain.DiagnosisKey;
import app.coronawarn.server.services.distribution.config.DistributionServiceConfig;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import org.springframework.context.annotation.Profile;

@Profile("demo")
public class DemoDiagnosisKeyBundler extends DiagnosisKeyBundler {

  public DemoDiagnosisKeyBundler(DistributionServiceConfig distributionServiceConfig) {
    super(distributionServiceConfig);
  }

  @Override
  protected void createDiagnosisKeyDistributionMap(Collection<DiagnosisKey> diagnosisKeys) {
    this.distributableDiagnosisKeys.clear();
    this.distributableDiagnosisKeys.putAll(diagnosisKeys.stream().collect(groupingBy(this::getSubmissionDateTime)));
  }

  @Override
  public List<DiagnosisKey> getDiagnosisKeysDistributableAt(LocalDateTime hour) {
    return this.getDiagnosisKeysForHour(hour);
  }
}
