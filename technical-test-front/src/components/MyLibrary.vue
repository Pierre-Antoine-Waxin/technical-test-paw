<template>
  <div class="page">
    <h1>Library Books 📚</h1>
    <table class="styled-table">
      <thead>
        <tr>
          <th>ISBN 📖</th>
          <th>Title 🖊️</th>
          <th>Publishing Year 🗓️</th>
          <th>Author 👤</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="book in books" :key="book.isbn">
          <td>{{ book.isbn }}</td>
          <td>{{ book.title }}</td>
          <td>{{ book.publishingYear }}</td>
          <td>{{ book.author.firstName }} {{ book.author.lastName }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      books: []
    };
  },
  created() {
    this.fetchBooks();
  },
  methods: {
    fetchBooks() {
      axios.get('http://localhost:8080/library/books')
        .then(response => {
          this.books = response.data;
        })
        .catch(error => {
          console.error('Error during books retrieval : ', error);
        });
    }
  }
};
</script>

<style scoped>
.page {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  min-height: 70vh;
  text-align: center;
}

h1 {
  color: #009879;
  margin-bottom: 20px;
  text-align: center;
}

.styled-table {
  border-collapse: collapse;
  margin: 25px 0;
  font-size: 0.9em;
  font-family: 'Arial', sans-serif;
  box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);
  margin-left: auto;
  margin-right: auto;
}

.styled-table thead tr {
  background-color: #009879;
  color: #ffffff;
  text-align: center;
}

.styled-table th,
.styled-table td {
  padding: 12px 15px;
}

.styled-table tbody tr {
  border-bottom: 1px solid #dddddd;
}

.styled-table tbody tr:nth-of-type(even) {
  background-color: #f3f3f3;
}

.styled-table tbody tr:last-of-type {
  border-bottom: 2px solid #009879;
}
</style>