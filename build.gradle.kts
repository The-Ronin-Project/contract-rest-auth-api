group = "com.projectronin.rest.contract"

plugins {
    alias(roningradle.plugins.openapi.contract)
}

restContractSupport {
    packageName.set("com.projectronin.services.auth.api")
    generatorType.set(com.projectronin.rest.contract.GeneratorType.OPENAPI_GENERATOR)
    openApiGeneratorAdditionalProperties.put("enumPropertyNaming", "original")
}
