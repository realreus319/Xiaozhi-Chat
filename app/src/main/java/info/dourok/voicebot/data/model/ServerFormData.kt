package info.dourok.voicebot.data.model

// :feature:form/data/model/ServerFormData.kt
data class ServerFormData(
    val serverType: ServerType = ServerType.XiaoZhi,
    val xiaoZhiConfig: XiaoZhiConfig = XiaoZhiConfig(),
    val skipConfigAfterConnect: Boolean = true
)

enum class ServerType {
    XiaoZhi
}

data class XiaoZhiConfig(
    val webSocketUrl: String = "wss://ws.dell.4dbim.cc:1143/xiaozhi/v1/",
    val qtaUrl: String = "https://xz.dell.4dbim.cc:1143/xiaozhi/ota/",
    val transportType: TransportType = TransportType.MQTT
)

enum class TransportType {
    MQTT, WebSockets
}

// :feature:form/data/model/ValidationResult.kt
data class ValidationResult(
    val isValid: Boolean,
    val errors: Map<String, String> = emptyMap()
)