package example.model;

import io.avaje.jsonb.Json;
import jakarta.annotation.Nullable;
import org.immutables.value.Value;

import java.net.URI;

@Json
@Json.SubType(type = ImmutableLink.class)
@Value.Immutable
public interface Link {
    URI uri();

    @Nullable
    String token();
}
