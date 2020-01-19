import React from 'react';
import './Login.css'
import imageStar from '../images/Star.svg'
import PropTypes from 'prop-types';

class Login extends React.Component {
    constructor(props) {
        super(props);
        this.state = {username: '', password: ''};
    }

    onSubmit = (e) => {
        e.preventDefault();
        if (this.state.username === 'Rico') {
            this.props.loginCallback();
        } else {
            // Invalidate the form or something?
        }
    };

    onChange = (e) => {
        this.setState({[e.target.name]: e.target.value})
    };

    render() {
        return (
            <div className="login-wrapper text-center" onSubmit={this.onSubmit}>
                <form className="form-signin">
                    <img className="mb-4" src={imageStar} alt="" width="72" height="72"/>
                    <h1 className="h3 mb-3 font-weight-normal">Elite Four</h1>
                    <label htmlFor="inputUsername" className="sr-only">Username</label>
                    <input type="text"
                           name="username"
                           id="inputUsername"
                           className="form-control"
                           placeholder="Username"
                           value={this.state.username}
                           onChange={this.onChange}
                           required
                           autoFocus />
                    <label htmlFor="inputPassword" className="sr-only">Password</label>
                    <input type="password"
                           name="password"
                           id="inputPassword"
                           className="form-control"
                           placeholder="Password"
                           value={this.state.password}
                           onChange={this.onChange}
                           required />
                    <button className="btn btn-lg btn-primary btn-block" type="submit">Sign in
                    </button>
                    <p className="mt-5 mb-3 text-muted">Created by Rico Apon</p>
                </form>
            </div>
        );
    }
}

Login.propTypes = {
    loginCallback: PropTypes.func
};

export default Login;
