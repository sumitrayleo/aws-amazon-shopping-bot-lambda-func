package io.github.satr.aws.lambda.shoppingbot.services;

import com.sun.istack.internal.NotNull;
import io.github.satr.aws.lambda.shoppingbot.log.Logger;

public class Service {
    private Logger logger;

    protected Service(@NotNull Logger logger) {
        this.logger = logger;
    }

    protected Logger getLogger() {
        return logger;
    }
}