require('dotenv').config();
const express = require('express');
const mongoose = require('mongoose');
const cors = require('cors');
const cookieParser = require('cookie-parser');

const app = express();
app.use(express.json());
app.use(cors());
app.use(cookieParser());

app.get('/', (req, res) => {
    res.json({msg: "Hello"});
});

const URI = process.env.DB_URI
mongoose.connect(URI, {
    useNewUrlParser: true,
    useUnifiedTopology: true
}, error => {
    if(error) throw error;
    console.log('Connected to mongoDB');
})

const port = process.env.PORT || 5000
app.listen(port, () => {
    console.log("Server started on port", port);
})
