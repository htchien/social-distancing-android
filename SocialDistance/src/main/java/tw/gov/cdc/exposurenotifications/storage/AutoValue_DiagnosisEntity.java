package tw.gov.cdc.exposurenotifications.storage;

import androidx.annotation.Nullable;

import org.threeten.bp.LocalDate;

// Generated by com.google.auto.value.processor.AutoValueProcessor
final class AutoValue_DiagnosisEntity extends DiagnosisEntity {

    private final long id;

    private final long createdTimestampMs;

    private final DiagnosisEntity.Shared sharedStatus;

    private final String verificationCode;

    private final String longTermToken;

    private final String certificate;

    private final DiagnosisEntity.TestResult testResult;

    private final LocalDate onsetDate;

    private final boolean isServerOnsetDate;

    private final DiagnosisEntity.HasSymptoms hasSymptoms;

    private final String revisionToken;

    private final DiagnosisEntity.TravelStatus travelStatus;

    private final boolean isCodeFromLink;

    private AutoValue_DiagnosisEntity(
            long id,
            long createdTimestampMs,
            @Nullable DiagnosisEntity.Shared sharedStatus,
            @Nullable String verificationCode,
            @Nullable String longTermToken,
            @Nullable String certificate,
            @Nullable DiagnosisEntity.TestResult testResult,
            @Nullable LocalDate onsetDate,
            boolean isServerOnsetDate,
            DiagnosisEntity.HasSymptoms hasSymptoms,
            @Nullable String revisionToken,
            @Nullable DiagnosisEntity.TravelStatus travelStatus,
            boolean isCodeFromLink) {
        this.id = id;
        this.createdTimestampMs = createdTimestampMs;
        this.sharedStatus = sharedStatus;
        this.verificationCode = verificationCode;
        this.longTermToken = longTermToken;
        this.certificate = certificate;
        this.testResult = testResult;
        this.onsetDate = onsetDate;
        this.isServerOnsetDate = isServerOnsetDate;
        this.hasSymptoms = hasSymptoms;
        this.revisionToken = revisionToken;
        this.travelStatus = travelStatus;
        this.isCodeFromLink = isCodeFromLink;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public long getCreatedTimestampMs() {
        return createdTimestampMs;
    }

    @Nullable
    @Override
    public DiagnosisEntity.Shared getSharedStatus() {
        return sharedStatus;
    }

    @Nullable
    @Override
    public String getVerificationCode() {
        return verificationCode;
    }

    @Nullable
    @Override
    public String getLongTermToken() {
        return longTermToken;
    }

    @Nullable
    @Override
    public String getCertificate() {
        return certificate;
    }

    @Nullable
    @Override
    public DiagnosisEntity.TestResult getTestResult() {
        return testResult;
    }

    @Nullable
    @Override
    public LocalDate getOnsetDate() {
        return onsetDate;
    }

    @Override
    public boolean getIsServerOnsetDate() {
        return isServerOnsetDate;
    }

    @Override
    public DiagnosisEntity.HasSymptoms getHasSymptoms() {
        return hasSymptoms;
    }

    @Nullable
    @Override
    public String getRevisionToken() {
        return revisionToken;
    }

    @Nullable
    @Override
    public DiagnosisEntity.TravelStatus getTravelStatus() {
        return travelStatus;
    }

    @Override
    public boolean getIsCodeFromLink() {
        return isCodeFromLink;
    }

    @Override
    public String toString() {
        return "DiagnosisEntity{"
                + "id=" + id + ", "
                + "createdTimestampMs=" + createdTimestampMs + ", "
                + "sharedStatus=" + sharedStatus + ", "
                + "verificationCode=" + verificationCode + ", "
                + "longTermToken=" + longTermToken + ", "
                + "certificate=" + certificate + ", "
                + "testResult=" + testResult + ", "
                + "onsetDate=" + onsetDate + ", "
                + "isServerOnsetDate=" + isServerOnsetDate + ", "
                + "hasSymptoms=" + hasSymptoms + ", "
                + "revisionToken=" + revisionToken + ", "
                + "travelStatus=" + travelStatus + ", "
                + "isCodeFromLink=" + isCodeFromLink
                + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof DiagnosisEntity) {
            DiagnosisEntity that = (DiagnosisEntity) o;
            return this.id == that.getId()
                    && this.createdTimestampMs == that.getCreatedTimestampMs()
                    && (this.sharedStatus == null ? that.getSharedStatus() == null : this.sharedStatus.equals(that.getSharedStatus()))
                    && (this.verificationCode == null ? that.getVerificationCode() == null : this.verificationCode.equals(that.getVerificationCode()))
                    && (this.longTermToken == null ? that.getLongTermToken() == null : this.longTermToken.equals(that.getLongTermToken()))
                    && (this.certificate == null ? that.getCertificate() == null : this.certificate.equals(that.getCertificate()))
                    && (this.testResult == null ? that.getTestResult() == null : this.testResult.equals(that.getTestResult()))
                    && (this.onsetDate == null ? that.getOnsetDate() == null : this.onsetDate.equals(that.getOnsetDate()))
                    && this.isServerOnsetDate == that.getIsServerOnsetDate()
                    && this.hasSymptoms.equals(that.getHasSymptoms())
                    && (this.revisionToken == null ? that.getRevisionToken() == null : this.revisionToken.equals(that.getRevisionToken()))
                    && (this.travelStatus == null ? that.getTravelStatus() == null : this.travelStatus.equals(that.getTravelStatus()))
                    && this.isCodeFromLink == that.getIsCodeFromLink();
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h$ = 1;
        h$ *= 1000003;
        h$ ^= (int) ((id >>> 32) ^ id);
        h$ *= 1000003;
        h$ ^= (int) ((createdTimestampMs >>> 32) ^ createdTimestampMs);
        h$ *= 1000003;
        h$ ^= (sharedStatus == null) ? 0 : sharedStatus.hashCode();
        h$ *= 1000003;
        h$ ^= (verificationCode == null) ? 0 : verificationCode.hashCode();
        h$ *= 1000003;
        h$ ^= (longTermToken == null) ? 0 : longTermToken.hashCode();
        h$ *= 1000003;
        h$ ^= (certificate == null) ? 0 : certificate.hashCode();
        h$ *= 1000003;
        h$ ^= (testResult == null) ? 0 : testResult.hashCode();
        h$ *= 1000003;
        h$ ^= (onsetDate == null) ? 0 : onsetDate.hashCode();
        h$ *= 1000003;
        h$ ^= isServerOnsetDate ? 1231 : 1237;
        h$ *= 1000003;
        h$ ^= hasSymptoms.hashCode();
        h$ *= 1000003;
        h$ ^= (revisionToken == null) ? 0 : revisionToken.hashCode();
        h$ *= 1000003;
        h$ ^= (travelStatus == null) ? 0 : travelStatus.hashCode();
        h$ *= 1000003;
        h$ ^= isCodeFromLink ? 1231 : 1237;
        return h$;
    }

    @Override
    public DiagnosisEntity.Builder toBuilder() {
        return new Builder(this);
    }

    static final class Builder extends DiagnosisEntity.Builder {
        private Long id;
        private Long createdTimestampMs;
        private DiagnosisEntity.Shared sharedStatus;
        private String verificationCode;
        private String longTermToken;
        private String certificate;
        private DiagnosisEntity.TestResult testResult;
        private LocalDate onsetDate;
        private Boolean isServerOnsetDate;
        private DiagnosisEntity.HasSymptoms hasSymptoms;
        private String revisionToken;
        private DiagnosisEntity.TravelStatus travelStatus;
        private Boolean isCodeFromLink;

        Builder() {
        }

        private Builder(DiagnosisEntity source) {
            this.id = source.getId();
            this.createdTimestampMs = source.getCreatedTimestampMs();
            this.sharedStatus = source.getSharedStatus();
            this.verificationCode = source.getVerificationCode();
            this.longTermToken = source.getLongTermToken();
            this.certificate = source.getCertificate();
            this.testResult = source.getTestResult();
            this.onsetDate = source.getOnsetDate();
            this.isServerOnsetDate = source.getIsServerOnsetDate();
            this.hasSymptoms = source.getHasSymptoms();
            this.revisionToken = source.getRevisionToken();
            this.travelStatus = source.getTravelStatus();
            this.isCodeFromLink = source.getIsCodeFromLink();
        }

        @Override
        public DiagnosisEntity.Builder setId(long id) {
            this.id = id;
            return this;
        }

        @Override
        public DiagnosisEntity.Builder setCreatedTimestampMs(long createdTimestampMs) {
            this.createdTimestampMs = createdTimestampMs;
            return this;
        }

        @Override
        public DiagnosisEntity.Builder setSharedStatus(DiagnosisEntity.Shared sharedStatus) {
            this.sharedStatus = sharedStatus;
            return this;
        }

        @Override
        public DiagnosisEntity.Builder setVerificationCode(String verificationCode) {
            this.verificationCode = verificationCode;
            return this;
        }

        @Override
        public DiagnosisEntity.Builder setLongTermToken(String longTermToken) {
            this.longTermToken = longTermToken;
            return this;
        }

        @Override
        public DiagnosisEntity.Builder setCertificate(String certificate) {
            this.certificate = certificate;
            return this;
        }

        @Override
        public DiagnosisEntity.Builder setTestResult(DiagnosisEntity.TestResult testResult) {
            this.testResult = testResult;
            return this;
        }

        @Override
        public DiagnosisEntity.Builder setOnsetDate(LocalDate onsetDate) {
            this.onsetDate = onsetDate;
            return this;
        }

        @Override
        public DiagnosisEntity.Builder setIsServerOnsetDate(boolean isServerOnsetDate) {
            this.isServerOnsetDate = isServerOnsetDate;
            return this;
        }

        @Override
        public DiagnosisEntity.Builder setHasSymptoms(DiagnosisEntity.HasSymptoms hasSymptoms) {
            if (hasSymptoms == null) {
                throw new NullPointerException("Null hasSymptoms");
            }
            this.hasSymptoms = hasSymptoms;
            return this;
        }

        @Override
        public DiagnosisEntity.Builder setRevisionToken(String revisionToken) {
            this.revisionToken = revisionToken;
            return this;
        }

        @Override
        public DiagnosisEntity.Builder setTravelStatus(DiagnosisEntity.TravelStatus travelStatus) {
            this.travelStatus = travelStatus;
            return this;
        }

        @Override
        public DiagnosisEntity.Builder setIsCodeFromLink(boolean isCodeFromLink) {
            this.isCodeFromLink = isCodeFromLink;
            return this;
        }

        @Override
        public DiagnosisEntity build() {
            String missing = "";
            if (this.id == null) {
                missing += " id";
            }
            if (this.createdTimestampMs == null) {
                missing += " createdTimestampMs";
            }
            if (this.isServerOnsetDate == null) {
                missing += " isServerOnsetDate";
            }
            if (this.hasSymptoms == null) {
                missing += " hasSymptoms";
            }
            if (this.isCodeFromLink == null) {
                missing += " isCodeFromLink";
            }
            if (!missing.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + missing);
            }
            return new AutoValue_DiagnosisEntity(
                    this.id,
                    this.createdTimestampMs,
                    this.sharedStatus,
                    this.verificationCode,
                    this.longTermToken,
                    this.certificate,
                    this.testResult,
                    this.onsetDate,
                    this.isServerOnsetDate,
                    this.hasSymptoms,
                    this.revisionToken,
                    this.travelStatus,
                    this.isCodeFromLink);
        }
    }

}