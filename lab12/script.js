document.addEventListener('DOMContentLoaded', function() {
    
    const { jsPDF } = window.jspdf; 
    const downloadButton = document.getElementById('download-pdf-btn');

    if (downloadButton) {
        downloadButton.addEventListener('click', function() {
            const content = document.querySelector('.container');
            
            this.style.display = 'none';
            
            html2canvas(content, { 
                scale: 2,
                logging: false 
            }).then(canvas => {
                const imgData = canvas.toDataURL('image/png');
                const pdf = new jsPDF('p', 'mm', 'a4'); // 'p - portrait, mm - units, a4 - size
                
                const imgWidth = 210; // A4 width in mm
                const pageHeight = 295; // A4 height in mm
                const imgHeight = canvas.height * imgWidth / canvas.width;
                let heightLeft = imgHeight;
                
                let position = 0;
                
                pdf.addImage(imgData, 'PNG', 0, position, imgWidth, imgHeight);
                heightLeft -= pageHeight;

                while (heightLeft >= 0) {
                    position = heightLeft - imgHeight;
                    pdf.addPage();
                    pdf.addImage(imgData, 'PNG', 0, position, imgWidth, imgHeight);
                    heightLeft -= pageHeight;
                }
                
                pdf.save('Vania_Vaneva_CV.pdf');
                
                this.style.display = 'block';
            });
        });
    }
});