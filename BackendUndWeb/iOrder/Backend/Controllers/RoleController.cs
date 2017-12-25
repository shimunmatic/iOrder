﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Backend.Models.Business;
using Backend.Models.Entity;
using Backend.Repositories.Interface;
using Backend.Services.Interface;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace Backend.Controllers
{
    [Produces("application/json")]
    [Route("api/Role")]
    public class RoleController : Controller
    {
        private IRoleService Service;
        //TODO change from Role to RoleView

        public RoleController(IRoleService service)
        {
            Service = service;
        }

        // GET: api/Role
        [HttpGet]
        public IEnumerable<Role> Get() => Service.GetAll();

        // GET: api/Role/5
        [HttpGet("{id}", Name = "Get")]
        public Role Get(int id)
        {
            return Service.GetById(id);
        }

    }
}