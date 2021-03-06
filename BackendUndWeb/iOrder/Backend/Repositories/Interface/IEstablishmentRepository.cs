﻿using Backend.Models.Business;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Backend.Repositories.Interface
{
    public interface IEstablishmentRepository:IBaseRepository<Establishment>
    {
        IEnumerable<Establishment> GetEstablishmentsForOwner(string Username);
        IEnumerable<Establishment> GetEstablishmentsForWarehouse(long Id);
    }
}
