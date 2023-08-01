plugins {
    alias(roningradle.plugins.openapi.contract)
}

node {
    download.set(true)
    version.set("18.12.1")
}
