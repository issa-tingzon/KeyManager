/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package keymanager.service;
import keymanager.model.User;
/**
*
* @author angelukayetiu
*/
public class UserRegServiceImpl implements UserRegService {
    private SSLKGCClient client;
    private User user;
    
    public UserRegServiceImpl() {}
    
    @Override
    public void configureConnection(String host, int port, String pubKey, String password) throws SSLClientErrorException{
        client = new SSLKGCClient(user.getUsername(), host, port, pubKey, password);
        client.generateKeys();
    }
    
    @Override
    public void setUser(User user) {
        user.setUsername(user.getFirstName()+user.getFirstName());
        this.user = user;
    }
}