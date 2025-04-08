# 🌐 IP-Geolocation-Java

Um simples programa em Java que localiza o endereço IP público da sua máquina e exibe informações detalhadas de geolocalização, como país, cidade, latitude, longitude, provedor de internet, entre outros.

## 📸 Demonstração

```
🧭 Informações do IP:
IP: 123.456.789.000
País: Brazil
Região: São Paulo
Cidade: São Paulo
CEP: 01000-000
Latitude: -23.5505
Longitude: -46.6333
ISP: Vivo
Org: Vivo
```

## 🛠 Requisitos

- Java 8 ou superior
- Biblioteca externa: `org.json`

### 🧱 Se estiver usando Maven, adicione ao `pom.xml`:

```xml
<dependency>
    <groupId>org.json</groupId>
    <artifactId>json</artifactId>
    <version>20231013</version>
</dependency>
```

## 🚀 Como executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/ghostkotenok/IP-Geolocation-Java.git
   cd IP-Geolocation-Java
   ```

2. Compile e execute:
   ```bash
   javac -cp .:json.jar src/IPGeolocation.java
   java -cp .:json.jar src.IPGeolocation
   ```

   > 💡 Use `;` ao invés de `:` no classpath se estiver no Windows.

## 🔍 Sobre a API utilizada

Este projeto usa a API gratuita de `http://ip-api.com/json`, que retorna as informações com base no seu IP público. Ela não requer autenticação para uso básico e tem uma boa taxa de requisições (45 por minuto).

## 📝 Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

## 🤝 Contribuições

Contribuições são muito bem-vindas! Sinta-se à vontade para abrir uma issue ou um pull request.

---

Desenvolvido com 💙 por [ghostkotenok](https://github.com/ghostkotenok)
