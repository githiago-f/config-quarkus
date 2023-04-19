package org.acme.conf;

import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithName;

@ConfigMapping(prefix = "ifrs")
public interface Pw2Config {
    @WithName("pw2")
    String message();
}
