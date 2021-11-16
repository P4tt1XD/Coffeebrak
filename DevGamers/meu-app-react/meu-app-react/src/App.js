import { Component } from 'react';
import { Switch, Route } from 'react-router-dom';
import axios from 'axios';


import './App.css';

import Header from '../../../components/Header';
import Footer from '../../../components/Footer';
import Home from '../../../components/Home';
import GameList from '../../../components/GamesList';

class App extends Component {
  state = {
    GameList: []
  }

  componentDidMount = () => {
    console.log(process.env)
    axios.get(`http://localhost:8000/games`)
    .then((result) => {
      this.setState({
        GameList: result.data
      })
    })
  }

  render () {
    return (
      <>
      <Header />
      <Switch>
        <Route exact path="/" component={Home} />
        <Route patch="/games" render={(props) => <GameList {...props} games={this.state.GameList} />}/> 
      </Switch>
      <Footer />
      </>
    );
  }

}

export default App;
