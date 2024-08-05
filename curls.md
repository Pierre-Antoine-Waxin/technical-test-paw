
# Get all books
```
curl --location 'http://localhost:8080/library/books'
```

# Publish book
```
curl --location 'http://localhost:8080/library/books' \
--header 'Content-Type: application/json' \
--data '{
    "isbn": "978-1529077198",
    "title": "Les misérables",
    "publishingYear": 1862,
    "author": {
        "id": "9799228103",
        "firstName": "Victor",
        "lastName": "Hugo"
    }
}'
```

# Publish author
```
curl --location 'http://localhost:8080/library/authors' \
--header 'Content-Type: application/json' \
--data '{
    "id": "9799228105",
    "firstName": "Emile",
    "lastName": "Zola"
}'
```