﻿using Backend.Models.Business;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Backend.Repositories.Interface
{
    interface ICategoryRepository:IBaseRepository<Category>
    {
        Category GetParent(long Id);
        IEnumerable<Category> GetCategoriesOfOwner(string username);

    }
}