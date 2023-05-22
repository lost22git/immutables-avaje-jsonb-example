package example.model;


import io.avaje.jsonb.Json;
import org.immutables.value.Value;

import java.util.List;

@Json
@Value.Style(
    of = "new",
    allParameters = true,
    passAnnotations = Json.class
)
@Value.Immutable
public interface Video {
    String name();

    int width();

    int height();

    List<ImmutableLink> links();

    VideoCodec videoCodec();

}
