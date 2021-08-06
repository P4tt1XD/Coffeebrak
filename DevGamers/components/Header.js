import React from 'react'
import {Link} from 'react-router-dom'

const Header = () => {
    return(
        <nav>
            <img src="" alt="logo"/> 
            <Link to="/home"> Home </Link>
            <Link to="/games"> Games </Link>
            <Link to="/"> </Link>
            <Link to="/aboutUs"> About Us </Link>
        </nav>
    )
}

export default Header