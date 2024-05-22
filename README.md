## Implement JWT authentication in a Spring Boot 3 application && Restorent ManagementSystem
<p>One of the most popular and effective authentication methods in modern web applications is JSON Web Tokens (JWT). It provides a flexible and stateless way to verify users' identities and secure API endpoints; it is also called Token-Based Authentication.</p>

## What we will build

<p>The API must expose routes where some are accessible without authentication while others require one. Below are the routes:</p>

<ul>
  <li>[POST] /auth/signup → Register a new user</li>
  <li>[POST] /auth/login → Authenticate a user</li>
  <li>[GET] /users/me → Retrieve the current authenticated user</li>
  <li>[GET] /users → Retrieve the current authenticated user</li>
  <li>[POST]/mymenu/addProduct -> add Product </li>
  <li>[PUT]/mymenu/updateProduct/{pass product id} -> Update Product</li>
  <li>[Delete]/mymenu/deleteProduct/{pass product id} -> delete data</li>
  <li>[Get]/mymenu/getData/ -> Get All data</li>
</ul>
<p>The routes “/auth/signup” and “/auth/login” can be accessed without</p>
<p>authentication while “users/me”, “users”, and "/mymenu" , "/mymenu/addProduct" ... require to be authenticated.</p>
