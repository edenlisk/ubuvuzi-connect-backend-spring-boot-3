package com.edenlisk.ubuvuzi.connect.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.security.KeyPair;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

@Component
@Getter @Setter @AllArgsConstructor
public class RSAKeyProperties {
    
    private RSAPublicKey publicKey;
    private RSAPrivateKey privateKey;

    public RSAKeyProperties(){
        KeyPair pair = KeyGeneratorUtility.generateRsaKey();
        this.publicKey = (RSAPublicKey) pair.getPublic();
        this.privateKey = (RSAPrivateKey) pair.getPrivate();
    }

//    public RSAPublicKey getPublicKey(){
//        return this.publicKey;
//    }
//
//    public void setPublicKey(RSAPublicKey publicKey){
//        this.publicKey = publicKey;
//    }
//
//    public RSAPrivateKey getPrivateKey(){
//        return this.privateKey;
//    }
//
//    public void setPrivateKey(RSAPrivateKey privateKey){
//        this.privateKey = privateKey;
//    }

}
