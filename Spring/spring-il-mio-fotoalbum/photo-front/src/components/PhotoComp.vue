<script>
import axios from 'axios';
const base_url = "http://localhost:8080/api/v1"

export default {
    name: "PhotoComp",
    props: { photo: Object },
    data() {
        return {

        }
    },
}
</script>

<template>
    <!-- Ogni foto viene rappresentata come un elemento della lista -->
    <li class="list-group-item">
        <!-- Visualizza il titolo della foto -->
        <h2>{{ photo.title }}</h2>
        <!-- Visualizza la descrizione della foto -->
        <p>{{ photo.description }}</p>
    </li>
</template>

<style scoped></style>