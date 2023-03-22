package constants;

public enum EndPoints {
    STORE("/store"),

    ACCOUNT("/Account");

    public final String url;

    EndPoints(String url) {
        this.url = url;
    }
}
