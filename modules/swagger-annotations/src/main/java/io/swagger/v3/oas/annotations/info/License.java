package io.swagger.v3.oas.annotations.info;

import io.swagger.v3.oas.annotations.OpenAPI31;
import io.swagger.v3.oas.annotations.extensions.Extension;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The annotation may be used in {@link Info#license()} to define a license for the OpenAPI spec.
 *
 * @see <a target="_new" href="https://github.com/OAI/OpenAPI-Specification/blob/3.0.4/versions/3.0.4.md#license-object">License (OpenAPI 3.0 pecification)</a>
 * @see <a target="_new" href="https://github.com/OAI/OpenAPI-Specification/blob/3.1.1/versions/3.1.1.md#license-object">License (OpenAPI 3.1 specification)</a>
 * @see io.swagger.v3.oas.annotations.OpenAPIDefinition
 * @see Info
 **/
@Target({})
@Retention(RetentionPolicy.RUNTIME)
public @interface License {
    /**
     * The license name used for the API.
     *
     * @return the name of the license
     **/
    String name() default "";

    /**
     * A URL to the license used for the API. MUST be in the format of a URL.
     *
     * @return URL to the license
     **/
    String url() default "";

    /**
     * The list of optional extensions
     *
     * @return an optional array of extensions
     */
    Extension[] extensions() default {};

    /**
     * An identifier for a License instance.
     *
     * @since 2.2.12 / OpenAPI 3.1
     * @return the identifier of the license
     **/
    @OpenAPI31
    String identifier() default "";

}
