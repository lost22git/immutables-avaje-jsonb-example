package example.model;


import io.avaje.jsonb.Json;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Json
@Json.SubType(type = ImmutableVideo.class)
@Value.Immutable
public interface Video {
    String name();

    int width();

    int height();

    List<Link> links();

    Optional<VideoCodec> videoCodec();

}
