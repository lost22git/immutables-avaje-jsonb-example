package example.model;

import io.avaje.jsonb.Json;
import jakarta.annotation.Nullable;
import org.immutables.value.Value;

import java.net.URI;

@Json
@Value.Style(
    of = "new",
    allParameters = true,
    passAnnotations = Json.class
)
@Value.Immutable
public interface Link {
    URI uri();

    @Nullable
    String token();
}
