<p>For user (Get)</p>

```
http://localhost:8080/registerUser/John/john@gmail.com
```

<p>For user with Request Body (Post)</p>

```
http://localhost:8080/registerUserBody/
```

JSON:
```
{
 "name": "john", 
 "email": "john@gmail.com"
}
```
<p>For Library</p>
<p>To add a book (Post)</p>

``` 
http://localhost:8080/addbook
```

JSON:
```
{
  "title": "Sample Book",
  "author": "John Doe",
  "isbn": "1234567890", 
  "publishedYear": 2023
}
```

<p>Retreive a list of books (Get)</p>

```
http://localhost:8080/getbooks
```