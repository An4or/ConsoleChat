<h3>Простой чат с сервером, клиентом и ботом + Минимальный визуальный интерфейс</h3>

Ѕеrvеr - основной класс сервера.<br>
  Handler - вложенный класс, который реализовывает протокол общения с клиентом.<br>
Client - класс, запрашивающий и отправляющий серверу данные.<br>
  SocketThread - внутренний класс, отвечающий за поток, устанавливающий<br>
  сокетное соединение и читающий сообщения сервера.<br>
MessageType - enum, который отвечает за тип сообщений пересылаемых между<br>
клиентом и сервером.<br>
Message - класс, отвечающий за пересылаемые сообщения.<br>
Connection - класс соединения между клиентом и сервером.<br>
ConsoleHelper - вспомогательный класс, для чтения или записи в консоль.<br>
BotClient - дочерний класс Client, добавляет в чат бота.<br>
  BotSocketThread - внутренний клас, аналог SocketThread.<br>
ClientGuiModel - реализация клиента с графическим интерфейсом, отвечает<br>
за (Model в MVC).<br>
ClientGuiView - класс представления (View в MVC), реализован с помощью javax.swing.<br>
  GuiSocketThread  - внутренний класс, работает с моделью.<br>
ClientGuiController - дочерний класс Client (Controller в MVC)<br><br>

<h4>В проекте реализовано следующее:</h4>
Работа с сокетами;<br>
Сериализация и десериализация;<br>
Создание многопоточных приложений и их синхронизация;<br>
Применение паттерна MVC;<br>
Использование внутренних и вложенных классов;<br>
Работа с библиотекой Swing;<br>
Применение классов Calendar и SimpleDateFormat<br><h2>UML Diagram</h2><br>

![UML Diagram](https://github.com/An4or/ConsoleChat/blob/master/Chat_UML.png)



