package example.model;

import jakarta.annotation.Nullable;
import org.immutables.value.Value;

import java.net.URI;

@Value.Style(
    of = "new", // renames "of" method to "new", which is interpreted as plain constructor
    allParameters = true // unrelated to the line above: every attribute becomes parameter
    // reminder: don't get used to inline styles, read style guide!
)
@Value.Immutable
public interface Link {
    URI uri();

    @Nullable
    String token();
}
