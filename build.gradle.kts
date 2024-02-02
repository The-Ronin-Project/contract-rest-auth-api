group = "com.projectronin.rest.contract"

plugins {
    alias(roningradle.plugins.openapi.contract)
}

restContractSupport {
    packageName.set("com.projectronin.services.auth.api")
}

dependencies {
    openapi("com.projectronin.rest.contract:ronin-contract-shared-v1:1.0.1-DASH7243-SNAPSHOT@json")
}
