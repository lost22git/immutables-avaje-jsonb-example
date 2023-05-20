package example.model;

import io.avaje.jsonb.Json;

public enum VideoCodec {

    H264("H.264"),
    H265("H.265"),
    //
    ;

    private final String value;

    private VideoCodec(String value) {
        this.value = value;
    }

    @Json.Value
    public String getValue() {
        return this.value;
    }

}
