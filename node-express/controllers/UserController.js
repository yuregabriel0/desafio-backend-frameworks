const UserModel = require("../models/UserModel");

const getUser = (req, res) => {
  res.json(UserModel);
};

module.exports = { getUser };