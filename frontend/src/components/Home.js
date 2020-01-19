import React from 'react';
import './Home.css'

function Home() {
    return (
        <main role="main">
            <div className="modal fade" id="addListModal" tabIndex="-1" role="dialog"
                 aria-labelledby="exampleModalLabel"
                 aria-hidden="true">
                <div className="modal-dialog" role="document">
                    <div className="modal-content">
                        <div className="modal-body">
                            <div className="form-row">
                                <div className="col">
                                    <input type="text" className="form-control" id="inputItemName"
                                           placeholder="List name" autoFocus/>
                                </div>
                                <div className="col-auto">
                                    <button type="button" className="btn btn-primary">
                                        Add list
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <section className="jumbotron">
                <div className="container">
                    <h1 className="jumbotron-heading">Username</h1>
                    <p style={{marginBottom: 0}}>
                        You have 8 lists. <a href="#addListModal" data-toggle="modal">Create</a> a new list</p>
                </div>
            </section>

            <div className="album">
                <div className="container">
                    <div className="row">
                        <div className="col-md-4">
                            <div className="card mb-4 shadow-sm">
                                <div className="card-body">
                                    <h5 className="card-title">My pokemon list</h5>
                                    <p className="card-text text-muted">Contains 8 items.</p>
                                    <div className="d-flex justify-content-between align-items-center">
                                        <div className="btn-group">
                                            <button type="button" className="btn btn-sm btn-outline-primary">Edit
                                            </button>
                                        </div>
                                        <small className="text-success">Created</small>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div className="col-md-4">
                            <div className="card mb-4 shadow-sm">
                                <div className="card-body">
                                    <h5 className="card-title">My yugioh list</h5>
                                    <p className="card-text text-muted">Contains 8 items and has 3 favorites.</p>
                                    <div className="d-flex justify-content-between align-items-center">
                                        <div className="btn-group">
                                            <button type="button" className="btn btn-sm btn-outline-primary">View
                                            </button>
                                            <button type="button"
                                                    className="btn btn-sm btn-outline-secondary">Continue
                                            </button>
                                        </div>
                                        <small className="text-danger">Ongoing</small>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div className="col-md-4">
                            <div className="card mb-4 shadow-sm">
                                <div className="card-body">
                                    <h5 className="card-title">My digimon list</h5>
                                    <p className="card-text text-muted">Contains 8 items.</p>
                                    <div className="d-flex justify-content-between align-items-center">
                                        <div className="btn-group">
                                            <button type="button" className="btn btn-sm btn-outline-secondary">View
                                            </button>
                                        </div>
                                        <small className="text-primary">Finished</small>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div className="row">
                        <div className="col-md-4">
                            <div className="card mb-4 shadow-sm">
                                <div className="card-body">
                                    <h5 className="card-title">My pokemon list</h5>
                                    <p className="card-text text-muted">Contains 8 items.</p>
                                    <div className="d-flex justify-content-between align-items-center">
                                        <div className="btn-group">
                                            <button type="button" className="btn btn-sm btn-outline-primary">Edit
                                            </button>
                                        </div>
                                        <small className="text-success">Created</small>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div className="col-md-4">
                            <div className="card mb-4 shadow-sm">
                                <div className="card-body">
                                    <h5 className="card-title">My yugioh list</h5>
                                    <p className="card-text text-muted">Contains 8 items and has 3 favorites.</p>
                                    <div className="d-flex justify-content-between align-items-center">
                                        <div className="btn-group">
                                            <button type="button" className="btn btn-sm btn-outline-primary">View
                                            </button>
                                            <button type="button"
                                                    className="btn btn-sm btn-outline-secondary">Continue
                                            </button>
                                        </div>
                                        <small className="text-danger">Ongoing</small>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div className="col-md-4">
                            <div className="card mb-4 shadow-sm">
                                <div className="card-body">
                                    <h5 className="card-title">My digimon list</h5>
                                    <p className="card-text text-muted">Contains 8 items.</p>
                                    <div className="d-flex justify-content-between align-items-center">
                                        <div className="btn-group">
                                            <button type="button" className="btn btn-sm btn-outline-secondary">View
                                            </button>
                                        </div>
                                        <small className="text-primary">Finished</small>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </main>
    );
}

export default Home;
