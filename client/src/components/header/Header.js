import React from 'react'
import { Link } from 'react-router-dom'
import Menu from './Menu'
import Search from './Search'

const Header = () => {

    return (
        <div className="header bg-light">
            <nav className="navbar navbar-expand-lg navbar-light 
            bg-light justify-content-between align-middle">

                <Link to="/" className="logo">
                    <h1 className="navbar-brand text-uppercase p-0 m-0"
                    onClick={() => window.scrollTo({top: 0})}>
                        Cofeebreak
                    </h1>
                    <img src={"https://res.cloudinary.com/dagyejjin/image/upload/c_scale,w_38/v1636941928/Coffeebreak/logo_ldvvza.png"} alt="" className="topbarImg"/>
                </Link>

                <Search />

                <Menu />
            </nav>
        </div>
    )
}

export default Header
