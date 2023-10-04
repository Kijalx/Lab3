<p>For user (Get)</p>
<p><b>http://localhost:8080/registerUser/John/john@gmail.com</b></p>

<p>For user with Request Body (Post)</p>
<p><b>http://localhost:8080/registerUserBody/</b></p>
<p>
json: 
{
 "name": "john", 
 "email": "john@gmail.com"
}
</p>
<p>For Library</p>
<p>To add a book (Post)</p>
<p><b>http://localhost:8080/addbook</b></p>
<p>
###JSON:
'''cmd
{
  "title": "Sample Book",
  "author": "John Doe",
  "isbn": "1234567890", 
  "publishedYear": 2023
}
</p>
<p>Retreive a list of books (Get)</p>
<p><b>http://localhost:8080/getbooks</b></p>