import React from 'react';
import Home from "./components/Home";
import Login from "./components/Login";
import {
    BrowserRouter as Router,
    Switch,
    Route,
    Link
} from "react-router-dom";
import Faq from "./components/Faq";

class App extends React.Component {

    constructor(props) {
        super(props);
        this.state = { isLoggedIn: false }
    }

    login = () => {
        this.setState({
            isLoggedIn: true
        })
    };

    render() {
        if (!this.state.isLoggedIn) {
            return <Login loginCallback={this.login} />
        }

        return (
            <Router>
                <div>
                    <nav className="navbar navbar-expand-md navbar-dark bg-primary">
                        <div className="container">
                            <Link className="navbar-brand" to="/">Elite Four</Link>
                            <button className="navbar-toggler" type="button" data-toggle="collapse"
                                    data-target="#navbarCollapse"
                                    aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
                                <span className="navbar-toggler-icon"/>
                            </button>
                            <div className="collapse navbar-collapse" id="navbarCollapse">
                                <ul className="navbar-nav mr-auto">
                                    <li className="nav-item active">
                                        <Link className="nav-link" to="/">Home <span className="sr-only">(current)</span></Link>
                                    </li>
                                    <li className="nav-item">
                                        <Link className="nav-link" to="/faq">FAQ</Link>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </nav>

                    <Switch>
                        <Route exact path="/">
                            <Home />
                        </Route>
                        <Route path="/faq">
                            <Faq />
                        </Route>
                    </Switch>
                </div>
            </Router>
        );
    }
}

export default App;
