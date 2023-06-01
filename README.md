<h1>CATDOG-BOT</h1>

<details>
  <summary>Open for a surprise</summary>
  
![image](https://github.com/JoaoHr1/CatDog-bot/assets/115806935/27faea06-d5cf-4e27-a664-304adbc182a0)
  
</details>


<p> CatDog is a bot that allows THECATAPI and DOGCEOAPI to send cat or dog images using commands !cat or !dog, making the experience in discord chats cuter than ever</p>

---

Configuration

1- Clone this repository 

```
git clone https://github.com/JoaoHr1/CatDog-bot.git
```

---

2- Make sure you have the JDK (java development kit) version 17.0.0+ and Maven installed on your machine and.

---

3- Create a .env file and put your discord developer api key
```
TOKEN=YOUR_TOKEN_HERE
```

---

4- Build the application with maven clean package 
```
mvn clean package
```

---

5- Run the application
```
mvn clean compile exec:java -Dexec.mainClass="org.botapi.DiscordBot"
```

---

## Technologies used
* Java 17.0.7
* JDA (JAVA DISCORD API)
* MAVEN
  

This project is licensed under the MIT License. You can use, modify, and distribute this bot according to the terms of the license.
