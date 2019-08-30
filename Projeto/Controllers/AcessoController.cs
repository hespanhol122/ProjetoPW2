using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Projeto.Models;

namespace Projeto.Controllers
{
    public class AcessoController : Controller
    {
        public IActionResult Login()
        {
            return View();
        }

            public IActionResult Consulta()
        {
            return View();
        }

        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
    
}