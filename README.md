<h1>CATDOG-BOT</h1>

<details>
  <summary>Open for a surprise</summary>
  
![image](https://github.com/JoaoHr1/CatDog-bot/assets/115806935/27faea06-d5cf-4e27-a664-304adbc182a0)
  
</details>


<p> CatDog is a bot that allows THECATAPI and DOGCEOAPI to send cat or dog images using commands !cat and !dog, making the experience in discord chats cuter than ever</p>

If you want to put my bot on your community, just click <a href="https://discord.com/api/oauth2/authorize?client_id=1112261679326179388&permissions=311385208832&scope=bot">HERE</a>

---

Configuration

1- Clone this repository 

```
git clone https://github.com/JoaoHr1/CatDog-bot.git
```

---

2- Make sure you have the JDK (java development kit) version 17.0.0+ and Maven installed on your machine

---

3- Create a .env file and put your discord developer TOKEN, if you don't have it, generate one <a href="https://discord.com/developers/docs/intro">here</a>
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
