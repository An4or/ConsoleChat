package by.yakovtsev.consolechat.client;

/**
 * Created by Sasha on 12.02.2018.
 */
public class ClientGuiController extends Client {
    private ClientGuiModel model = new ClientGuiModel();
    private ClientGuiView view = new ClientGuiView(this);

    public static void main(String[] args) {
new ClientGuiController().run();
    }

    public ClientGuiModel getModel() {
        return model;
    }

    protected String getServerAddress(){
        return view.getServerAddress();
    }

    protected int getServerPort(){
        return   view.getServerPort();
    }

    protected String getUserName(){
        return  view.getUserName();
    }

    protected SocketThread getSocketThread(){
        return new GuiSocketThread();
    }

    public void run(){
        getSocketThread().run();
    }

    public class GuiSocketThread extends SocketThread {
        @Override
        protected void processIncomingMessage(String message) {
            model.setNewMessage(message);
            view.refreshMessages();
        }

        @Override
        protected void informAboutAddingNewUser(String userName) {
            model.addUser(userName);
            view.refreshUsers();
        }

        @Override
        protected void informAboutDeletingNewUser(String userName) {
            model.deleteUser(userName);
            view.refreshUsers();
        }

        @Override
        protected void notifyConnectionStatusChanged(boolean clientConnected) {
            super.notifyConnectionStatusChanged(clientConnected);
            view.notifyConnectionStatusChanged(clientConnected);
        }



    }

}
