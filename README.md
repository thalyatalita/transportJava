### Transportadora Java ls
## &nbsp; Methods 

- GET
- POST 
- DELETE
- UPDATE 

#### &nbsp; Method GET 

```
http://localhost:8080/server/contatos/all
```

#### &nbsp; Method GET BY ID

```
http://localhost:8080/server/contatos/{id}
```

#### &nbsp; Method POST

```
http://localhost:8080/server/contatos/save


{
  "nome": "digite o nome",
  "email": [
    {
      "nomeEmail":"digite o e-mail" 
    },
    { 
      "nomeEmail": "digite o e-mail"
    }
  ],
  "telefone":{
    "telefones":"your number"
  }
}

```

#### &nbsp; Method DELETE BY ID

```
http://localhost:8080/server/contatos/delete/{id}
```

#### &nbsp; Method UPDATE 

```
http://localhost:8080/server/contatos/update


{
  "id": number,
  "nome": "digite o nome",
  "email": [
    {
      "nomeEmail":"digite o e-mail" 
    },
    { 
      "nomeEmail": "digite o e-mail"
    }
  ],
  "telefone":{
    "telefones":"your number"
  }
}

```
